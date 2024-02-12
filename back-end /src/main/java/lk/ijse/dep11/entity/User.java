package lk.ijse.dep11.entity;

import jakarta.persistence.*;
import lk.ijse.dep11.enums.UserRole;
import lombok.Data;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    private String name;
    private UserRole role;

    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] img;
}
