class Filenames {
	
	const string DefaultRuleAssemblies = @"$(FxCopDir)\rules";
	
	void Main() {
		list.Add(Regex.Replace(dir, @"\$\(FxCopDir\)", fxCopPath, RegexOptions.CultureInvariant | RegexOptions.IgnoreCase));
		
		Registry.LocalMachine.OpenSubKey(@"HKEY_LOCAL_MACHINE\SOFTWARE\Microsoft\VisualStudio\9.0\Setup\EDev");
		
		string a = "Happy birthday, Joel"; // Happy birthday, Joel
		string b = @"Happy birthday, Joel"; // Happy birthday, Joel
		string c = "hello \t world"; // hello world
		string d = @"hello \t world"; // hello \t world
		string e = "Joe said \"Hello\" to me"; // Joe said "Hello" to me
		string f = @"Joe said ""Hello"" to me"; // Joe said "Hello" to me
		string g = "\\\\server\\share\\file.txt"; // \\server\share\file.txt
		string h = @"\\server\share\file.txt"; // \\server\share\file.txt
		string i = "one\r\ntwo\r\nthree";
		string j = @"one
		two
		three";
	}
}