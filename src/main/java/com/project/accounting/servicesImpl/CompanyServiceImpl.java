package com.project.accounting.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.accounting.model.Company;
import com.project.accounting.repository.CompanyRepository;
import com.project.accounting.services.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	@Autowired
	CompanyRepository companyRepository;
	
	@Override
	public Company saveCompany(Company company) {
		// TODO Auto-generated method stub
		return companyRepository.save(company);
	}

	@Override
	public Company updateCompany(Company company) {
		company = companyRepository.findById(company.getId()).get();
		return companyRepository.save(company);
	}

	@Override
	public void deleteCompany(Company company) {
		Company companyId = companyRepository.findById(company.getId()).get();
		companyRepository.delete(companyId);
	}

	@Override
	public List<Company> getAllCompany() {

		return companyRepository.findAll();
	}



}
