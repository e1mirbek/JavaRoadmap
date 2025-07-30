package generics.genericRepo.model;

// модель данных

public class User implements Entity {
    private Long id;
    private String name;
    private String email;


    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName () {
        return name;
    }

    public String getEmail () {
        return email;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id= id;
    }
}
