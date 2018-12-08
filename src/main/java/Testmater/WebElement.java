package Testmater;
/*
 * Class được sử dụng để xây dựng PageObject
 * Class được sử dụng để nhóm các Test Mothod theo function/feature
 ***Screenplay
 * Class được sử dụng để xây dựng lên các Abilities,
 */
public class WebElement {
	//Properties
	public String Value;
	public String CSS;
	//Constructor
	public WebElement()
	{
		
	}
	public WebElement(String Value, String CSS)
	{
		this.Value = Value;
		this.CSS = CSS;
	}
	//Method
	public void Input(String value)
	{
		this.Value=value;
	}
	
	public void AddClass(String css)
	{
		this.CSS = css;
	}
	
	public void DoAction()
	{
		System.out.println(this.Value);
		System.out.println(this.CSS);
	}
}
