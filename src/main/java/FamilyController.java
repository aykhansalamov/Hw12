import java.util.List;

public class FamilyController {
    FamilyService service;

    public List<Family> getAllFamilies() {

        return service.getAllFamilies();
    }

    public Family createNewFamily(Woman mother, Man father) {
        return service.createNewFamily(father, mother);
    }

    public void deleteFamily(int index) {
        service.deleteFamily(index);
    }

    public void deleteFamily(Family family) {
        service.deleteFamily(family);
    }

    public void getFamilyByIndex(int index) {
        service.getFamilyByIndex(index);
    }

    public void displayAllFamilies() {
        service.displayAllFamilies();
    }

    public void getFamiliesBiggerThan() {
        service.getFamiliesBiggerThan();
    }

    public void getFamiliesLessThan() {
        service.getFamiliesLessThan();
    }

    public Family adoptChild(Human child1, Family family) {
        return service.adoptChild(child1, family);
    }

    public int count() {
        return service.count();
    }

    public boolean getFamilyById(int id) {
        return service.getFamilyById(id);
    }
}
