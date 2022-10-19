package _21Java8Features._1LambdaExpressions._3RealWorldExample;

public class _1Book {
    private int id;
    private int pages;
    private String name;

    public _1Book(int id, String bookName, int pages) {
        this.id = id;
        this.pages = pages;
        this.name = bookName;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
