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
public class facturesProductClient {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;
			private int clientId;
			private int idProduct;
			private int qnt;
			private int tva;
			private int deviseId;
			
}
