/***************************************************************************
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 * + Department of Computer Science
 * + Software Engineering Group
 * and others.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

package util.unicode;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

import org.antlr.runtime.ANTLRStringStream;

public class ANTLRFileStreamWithBOM extends ANTLRStringStream {
	protected String	fileName;

	public ANTLRFileStreamWithBOM(final String fileName) throws IOException {
		this(fileName, null);
	}

	public ANTLRFileStreamWithBOM(final String fileName, final String encoding) throws IOException {
		this.fileName = fileName;
		load(fileName, encoding);
	}

	public void load(final String fileName, final String encoding) throws IOException {
		if (fileName == null) {
			return;
		}
		File f = new File(fileName);
		long length = f.length();
		if (length > Integer.MAX_VALUE) {
			throw new BufferOverflowException();
		}
		int size = (int) length;

		InputStreamReader isr;
		FileInputStream fis = new FileInputStream(fileName);

		UnicodeBOMInputStream bomInputStream = new UnicodeBOMInputStream(fis);
		bomInputStream.skipBOM();

		if (encoding != null) {
			isr = new InputStreamReader(bomInputStream, encoding);
		} else {
			isr = new InputStreamReader(bomInputStream);
		}

		// bug in ANTLR: what if size is > Integer.MAX_VALUE
		// solution: read content within a loop and with a StringBuilder
		try {
			data = new char[size];
			super.n = isr.read(data);
		} finally {
			isr.close();
		}
	}

	@Override
	public String getSourceName() {
		return fileName;
	}
}
