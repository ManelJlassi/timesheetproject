package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "T_USER")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;   
    
    private String firstName; 
    private String lastName;
    private String email; // AJOUTÉ : Champ manquant

    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    
    @Enumerated(EnumType.STRING)
    Role role; 
    
    public User() { }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; } // AJOUTÉ : Manquait au build

    public String getLastName() { return lastName; }
    public void setLastName(String lName) { this.lastName = lName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; } // AJOUTÉ : Manquait au build

    public Date getDateNaissance() { return dateNaissance; }
    public void setDateNaissance(Date dateNaissance) { this.dateNaissance = dateNaissance; }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }
}