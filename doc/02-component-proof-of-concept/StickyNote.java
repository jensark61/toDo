import java.util.List;

//hello
public class StickyNote {
    private String title;
    private List<String> bullets;

    public StickyNote(String title) {
        this.title = title;
        this.bullets = new List<>(); //Running into problems here?
    }

    //What the sticky note is for
    public String getTitle() {
        return this.title;
    }

    //Select a bullet
    public List<String> getBullets() {
        return this.bullets;
    }

    //Add a bullet
    public void addBullet(String bullet) {
        this.bullets.add(bullet);
    }

    //Get rid of a Bullet
    public boolean removeBullet(String bullet) {
        return this.bullets.remove(bullet);
    }
}

class toDoList {
    private List<StickyNote> notes;

    public ToDoList() {
        this.notes = new List<>();
    }

    public void stick(StickyNote note) {
        this.notes.add(note);
    }

    //Remove a note entirely
    public StickyNote rip(StickyNote note) {
        this.notes.remove(note);
        return note;
    }

    //A way to get rid of a note
    public void trash() {
        this.notes.clear();
    }

    //A more important bullet
    public void highlight(String title) {
        for (StickyNote note : this.notes) {
            if (note.getTitle().equals(title)) {
                this.notes.remove(note);
                this.notes.add(0, note);
                break;
            }
        }
    }

    //To get rid of a bullet
    public boolean strikeOut(String title, String bullet) {
        for (StickyNote note : this.notes) {
            if (note.getTitle().equals(title)) {
                return note.removeBullet(bullet);
            }
        }
        return false;
    }

    //To display the bullets for some reason
    public void showNote() {
        for (StickyNote note : this.notes) {
            System.out.println("Note: " + note.getTitle());
            for (String bullet : note.getBullets()) {
                System.out.println(" - " + bullet);
            }
        }
    }
}

//Conceptual - Was a little
//confused by the directions

// public class main {
//     public static void main(String[] args) {
//         ToDoList<String> groceryList = new ToDoList();

//         StickyNote note1 = new StickyNote("Groceries");
//         note1.addBullet("Milk");
//         note1.addBullet("Eggs");
//         note1.addBullet("Bread");

//         StickyNote note2 = new StickyNote("Chores");
//         note2.addBullet("Do laundry");
//         note2.addBullet("Clean dishes");
//     }
// }
