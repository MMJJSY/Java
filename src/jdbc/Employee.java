package jdbc;

public class Employee {

    private String employeeId; // 사원번호
    private String employeeName; // 이름
    private String employeeEName; // 영문이름
    private String position; // 직위
    private String gender; // 성별
    private String birth; // 생일
    private String hireDate; // 입사일
    private String address; // 주소
    private String city; // 도시
    private String region; // 지역
    private String phone; // 집전화
    private String bossId; // 상사번호
    private String departmentId; // 부서번호

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, String employeeEName, String position, String gender,
                    String birth, String hireDate, String address, String city, String region, String phone, String bossId,
                    String departmentId)
    {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEName = employeeEName;
        this.position = position;
        this.gender = gender;
        this.birth = birth;
        this.hireDate = hireDate;
        this.address = address;
        this.city = city;
        this.region = region;
        this.phone = phone;
        this.bossId = bossId;
        this.departmentId = departmentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEName() {
        return employeeEName;
    }

    public void setEmployeeEName(String employeeEName) {
        this.employeeEName = employeeEName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBossId() {
        return bossId;
    }

    public void setBossId(String bossId) {
        this.bossId = bossId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEName='" + employeeEName + '\'' +
                ", position='" + position + '\'' +
                ", gender='" + gender + '\'' +
                ", birth='" + birth + '\'' +
                ", hireDate='" + hireDate + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", phone='" + phone + '\'' +
                ", bossId='" + bossId + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }
}
