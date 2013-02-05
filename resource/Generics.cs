class Generics {
	
	static Dictionary<string[], List<FxCopCategory>> ruleDict = new Dictionary<string[], List<FxCopCategory>>(new ArrayHashCodeProvider());
	
	public Action<List<FxCopCategory>> callback;
	
	void Main() {
		WorkbenchSingleton.SafeThreadAsyncCall((Action<List<FxCopCategory>>)Callback, ruleList);
		base.Set<Output>(onSave(control));
	}
}
