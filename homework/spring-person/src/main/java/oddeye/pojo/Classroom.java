package oddeye.pojo;/*
 **description:
 **param&method:
 **caller:
 **problems:
 */



import java.util.List;
import java.util.Map;
import java.util.Set;

public class Classroom {
    private Integer cid;
    private String cname;
    private Teacher teacher;

    private List<String> classList;
    private Set<Student> studentSet;
    private Map<String,Student> studentMap;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<String> getClassList() {
        return classList;
    }

    public void setClassList(List<String> classList) {
        this.classList = classList;
    }

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }

    public Map<String, Student> getStudentMap() {
        return studentMap;
    }

    public void setStudentMap(Map<String, Student> studentMap) {
        this.studentMap = studentMap;
    }

    public Classroom(Integer cid, String cname, Teacher teacher, List<String> classList, Set<Student> studentSet, Map<String, Student> studentMap) {

        this.cid = cid;
        this.cname = cname;
        this.teacher = teacher;
        this.classList = classList;
        this.studentSet = studentSet;
        this.studentMap = studentMap;
    }

    public Classroom() {
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", teacher=" + teacher +
                ", classList=" + classList +
                ", studentSet=" + studentSet +
                ", studentMap=" + studentMap +
                '}';
    }
}
