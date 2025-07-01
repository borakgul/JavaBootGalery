package com.borakgul.Model;

import java.math.BigDecimal;

import com.borakgul.enums.CurrencyType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "account")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account extends BaseEntity {

	@Column(name = "account_no")
	private String AccountNo;
	
	@Column(name = "iban")
	private String iban;
	
	@Column(name = "amount")
	private BigDecimal amount;
	
	@Column(name = "currency_type")
	@Enumerated(EnumType.STRING)
	private CurrencyType currencyType;
	
}
