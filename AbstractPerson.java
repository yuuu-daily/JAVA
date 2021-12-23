abstract class AbstractPerson {
	// private int gender = -1;

	// public Person(int gender){
	//  this.gender = gender;
	// }
	protected abstract String getGender();

	public void speak(){
		System.out.println("I'm a " + getGender());
	}
}