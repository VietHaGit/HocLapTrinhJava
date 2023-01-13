package ExOOP.Bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficer {

    private List<Officer> officers;

    public ManagerOfficer(){
        this.officers = new ArrayList<Officer>();
    }
    public void addOfficer(Officer officer){
        this.officers.add(officer);
    }
    public List<Officer> searchOfficerByName(String name) {
        return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void showListInforOfficer() {
// forEach() là một phương thức mặc định được định nghĩa trong giao diện iterable. Nên các lớp collection extends iterable này có thể sử dụng vòng lặp forEach() này để duyệt các phần tử.
        this.officers.forEach(o -> System.out.println(o.toString()));
    }
}
