package com.empresa.cmc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.empresa.cmc.dto.Usuario;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ApiUsersImpl implements ApiUsers {
	Logger log = LoggerFactory.getLogger(ApiUsersImpl.class);

	@Value("${user.api.url}")
	private String userApiURL;

	@Autowired
	private ObjectMapper om;

	@Override
	public ArrayList<Usuario> sendApiUsers() {
		ResponseEntity<String> response;
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		try {
			response = restTemplate.getForEntity(userApiURL, String.class);
			if (response.getStatusCodeValue() == 200) {
				ArrayList<Usuario> users = om.readValue(response.getBody(), new TypeReference<ArrayList<Usuario>>() {
				});
				return users;
			}
			return null;
		} catch (Exception e) {
			log.error("Error " + e);
		}
		return null;
	}

}
