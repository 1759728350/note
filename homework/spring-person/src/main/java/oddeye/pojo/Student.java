package oddeye.pojo;/*
 **description:
 **param&method:
 **caller:
 **problems:
 */

public class Student {
    private Integer sid;
    private String sname;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + sname + '\'' +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Student(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }
}
