Class Student {
    private String name;
    private int id;
    private ArrayList courses;
    Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = newArrayList();
}
    public void addCourse(Course course){
        courses.add(courses);
}
    public void removeCourse(Course course) {
        courses.remove(courses); 
}
public ArrayList getCourses() {
return courses;
}
public double getGPA() {
    double total = 0;
Int count = 0; 
for (Course course : courses) {
total += course.getGrade();
count++;
}
return total / count; 
}}
class Course {
    private String name; 
    private int credits;
    private double grades;
    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
}
public void setGrade(double grade)
this.grade = grade 
{
public double getGrade() {
return Grade;
}
public int getCredits(){ return credits; }}
class Main {
public static void main(String[] args) {
    Course cs = new Course(“Computer Science”, 4);
    cs.setGrade(3.7);

Student alice = new Student(“Alice”, 1234);
alice.addCourse(cs);
