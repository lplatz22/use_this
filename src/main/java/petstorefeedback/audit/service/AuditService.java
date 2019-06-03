package petstorefeedback.audit.service;

import org.springframework.stereotype.Service;

import petstorefeedback.audit.AuditLog;

@Service
public class AuditService {

	public void execute(AuditLog bean) {
            //TODO: Save the audit data to audit repository
	}
}
