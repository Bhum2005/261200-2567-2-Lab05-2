import javax.swing.text.StyledEditorKit;
import java.time.LocalDate;

public class User {
    protected String Name;
    protected LocalDate dob;

    public User(){
        this.Name=null;
        this.dob=LocalDate.now();
    }

    public User(String n,int y,int m,int d){
        this.Name=n;
        this.dob=LocalDate.of(y,m,d);
    }

    public Boolean isBirthday(){
        if(LocalDate.now().getMonth().equals(this.dob.getMonth())&&LocalDate.now().getDayOfYear()==(this.dob.getDayOfYear())){
            return true;
        }
        else{
            return false;
        }
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.Name + "!");
    }

    public void displayInfo(){
        System.out.println("Name:"+this.Name);
        System.out.println("Dob:"+this.dob);
    }
}
