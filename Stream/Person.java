public class Person {
    private int id;
    private String name;
	private boolean flag;

    public Person(int id, String name, boolean flag) {
        this.id = id;
        this.name = name;
		this.flag = flag;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
	
	public boolean isFlag(){
		return flag;
	}
	
	@Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flag=" + flag +
                '}';
    }
}