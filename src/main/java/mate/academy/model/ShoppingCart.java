package mate.academy.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ShoppingCart {
    @Id
    private long id;
    private List<Ticket> tickets;
    @OneToOne
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ShoppingCart() {}
}
