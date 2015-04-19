/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.yahoo.api.socialdirectory.impl;

import org.springframework.social.yahoo.api.YahooProfile;
import org.springframework.social.yahoo.api.impl.AbstractYahooApiOperations;
import org.springframework.social.yahoo.api.socialdirectory.SocialDirectoryOperations;
import org.springframework.web.client.RestTemplate;

/**
 * @author Pedro Abalo
 */
public class SocialDirectoryTemplate extends AbstractYahooApiOperations implements SocialDirectoryOperations{

	private static final String PROFILE_URL = "https://social.yahooapis.com/v1/user/";
	private static final String PROFILE_URL_END = "/profile?format=json";
	
	public SocialDirectoryTemplate(RestTemplate restTemplate, boolean isAuthorized) {
		super(restTemplate,isAuthorized);
	}
	
	public YahooProfile getProfile(String id) {
		
		String url = PROFILE_URL + id + PROFILE_URL_END;
		
		return getEntity(url, YahooProfile.class);
	}
	
	public YahooProfile getProfile() {
		return getProfile("me");
	}

}
