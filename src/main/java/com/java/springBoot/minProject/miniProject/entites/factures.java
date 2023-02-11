package com.java.springBoot.minProject.miniProject.entites;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class factures {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;
			private Date date_add;
			
}
