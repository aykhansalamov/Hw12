import com.sun.deploy.util.JVMParameters;

import java.util.List;
import java.util.stream.Collectors;



public class FamilyService {

    FamilyDao dao;

    public List<Family> getAllFamilies() {

        return dao.getAllFamilies();
    }

    public Family createNewFamily(Man father, Woman mother) {
        Family family1 = new Family(mother, father);
        dao.saveFamily(family1);
        return family1;
    }

    public void deleteFamily(int index) {
        if (dao.deleteFamily(index)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }

    public void getFamilyByIndex(int index) {
        if (dao.getFamilyByIndex(index)) System.out.println(CollectionFamilyDao.family.get(index));
        else System.out.println("Entered family does not exist");
    }

    public void deleteFamily(Family family) {
        if (dao.deleteFamily(family)) System.out.println("Selected family has been deleted");
        else System.out.println("Entered family does not exist");
    }

    public void displayAllFamilies() {
    CollectionFamilyDao.family.stream().forEach(family1 -> family1.toString());
    }

    public int countFamiliesWithMemberNumber() {
        List<Family> family2 = CollectionFamilyDao.family.stream().filter(family1 -> family1.length() == 3).collect(Collectors.toList());
        int sizeFamily2 = family2.size();
        return sizeFamily2;

    }

    public void getFamiliesBiggerThan() {
        List<Family> biggerFamily = CollectionFamilyDao.family.stream().filter(family1 -> family1.length() > 3).collect(Collectors.toList());
    }

    public void getFamiliesLessThan() {
        List<Family> smallerFamily = CollectionFamilyDao.family.stream().filter(family1 -> family1.length() < 3).collect(Collectors.toList());
    }


    public Family adoptChild(Human child1, Family family) {
        family.addChild(child1);
        child1.setFamily(family);
        dao.saveFamily(family);
        return family;
    }

    public int count() {
        return getAllFamilies().size();
    }
    public boolean getFamilyById(int id) {
        return dao.getFamilyByIndex(id);
    }
}
