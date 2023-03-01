/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.api.server.configs.v1.exception;

/**
 * Client exception class for the JWT Authentication Service.
 */
public class JWTClientAuthenticatorClientException extends JWTClientAuthenticatorException {

    /**
     * The default constructor.
     */
    public JWTClientAuthenticatorClientException() {

    }

    /**
     * Constructor with {@code message} and {@code errorCode} parameters.
     *
     * @param message   Message to be included in the exception.
     * @param errorCode Error code of the exception.
     */
    public JWTClientAuthenticatorClientException(String message, String errorCode) {

        super(message, errorCode);
    }

    /**
     * Constructor with {@code message}, {@code errorCode} and {@code cause} parameters.
     *
     * @param message   Message to be included in the exception.
     * @param errorCode Error code of the exception.
     * @param cause     Exception to be wrapped.
     */
    public JWTClientAuthenticatorClientException(String message, String errorCode, Throwable cause) {

        super(message, errorCode, cause);
    }

    /**
     * Constructor with {@code cause} parameter.
     *
     * @param cause Exception to be wrapped.
     */
    public JWTClientAuthenticatorClientException(Throwable cause) {

        super(cause);
    }
}
