
package Models.Task;

import Models.Entity;
import Models.Members.Member;

/**
 *
 * @author David Duarte Garcia
 */
public class Task implements Entity{
    private int num;
    private String name; 
    private String description;
    private String starDate;
    private String endDate;
    private boolean completed; 
    private Member responsible;

    public Task(int num, String name, String description, String starDate, String endDate,Member responsible) {
        this.num = num;
        this.name = name;
        this.description = description;
        this.starDate    = starDate;
        this.endDate     = endDate;
        this.completed   = false;
        this.responsible = responsible;
    }

    public Task(int num, String name, String description, String starDate, String endDate) {
        this(num,name,description,starDate,endDate,null);
    }

    public Task(int num) {
        this(num,"","","","",null);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStarDate() {
        return starDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Member getResponsible() {
        return responsible;
    }

    public void setResponsible(Member responsible) {
        this.responsible = responsible;
    }

    @Override
    public boolean isComplete() {
        if (this.completed) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.num,this.name,this.description,this.starDate,this.endDate,this.responsible.toString()};
    }
    
    public void complete(){
        this.completed=true;
    } 
}
