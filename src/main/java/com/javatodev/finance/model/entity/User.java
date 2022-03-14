package com.javatodev.finance.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "banking_core_user")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String Name;
        private String email;
        private String mobileNumber;
        private String secondaryNumber;
        private String dob;
        private char gender;

        @OneToMany(mappedBy = "user",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
        private List<BankAccountEntity> accounts;

    }
}
