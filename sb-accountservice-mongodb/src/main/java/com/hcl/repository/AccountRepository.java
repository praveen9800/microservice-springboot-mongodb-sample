package com.hcl.repository;

import org.springframework.data.repository.CrudRepository;

import com.hcl.model.AccountModel;

public interface AccountRepository extends CrudRepository<AccountModel, String>{}