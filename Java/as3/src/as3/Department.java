package as3;

public class Department {
	    private Department [] departments;
	    private int id;
	    private String name;
	    private String diaChi;
	    public Department(int id, String name, String diaChi) {
	        this.id = id;
	        this.name = name;
	        this.diaChi = diaChi;
	    }

	    public String toString() {
	        return "id la: " + id + ", ten : " + name;
	    }
	    public String getDiaChi() {
	        return diaChi;
	    }

	    public void setDiaChi(String diaChi) {
	        this.diaChi = diaChi;
	    }
	}


