class Cast {

	void Main() {
		object key = newElement;
		object key2 = newElement is XamlObject ? true : null;
		object key3 = newElement is XamlObject ? ((XamlObject)newElement).GetXamlAttribute("Key") : null;
	}
}
