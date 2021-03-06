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
package org.springframework.social.yahoo.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.yahoo.api.Yahoo;
import org.springframework.social.yahoo.api.impl.YahooTemplate;

/**
 * @author Pedro Abalo
 */
public class YahooServiceProvider extends AbstractOAuth2ServiceProvider<Yahoo> {

	public YahooServiceProvider(String clientId, String clientSecret) {
		super(new YahooOAuth2Template(clientId, clientSecret));
	}

	@Override
	public Yahoo getApi(String accessToken) {
		return new YahooTemplate(accessToken);
	}

}
