/***************************************************************************
 * Copyright 2012 by
 * + Christian-Albrechts-University of Kiel
 * + Department of Computer Science
 * + Software Engineering Group
 * and others.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/

package lang.csharp;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;

// Generic type parameters are not supported by ANTLR's option TokenLabelType
@Deprecated
public class CommonReturnToken extends CommonToken {

    private static final long serialVersionUID = 1L;

    public CommonReturnToken(CharStream input, int type, int channel,
            int start, int stop) {
        super(input, type, channel, start, stop);
    }

    public CommonReturnToken(int type, String text) {
        super(type, text);
    }

    public CommonReturnToken(int type) {
        super(type);
    }

    public CommonReturnToken(Token oldToken) {
        super(oldToken);
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public boolean result;

}
