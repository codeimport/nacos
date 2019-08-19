/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
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
package com.alibaba.nacos.config.server.model;

import java.io.Serializable;
import java.util.Map;

/**
 * sample result
 *
 * @author Nacos
 */
public class SampleResult implements Serializable {

    /**
     * 随机数
     */
    private static final long serialVersionUID = 2587823382317389453L;

    private Map<String, String> listenersGroupkeyStatus;

    public Map<String, String> getListenersGroupkeyStatus() {
        return listenersGroupkeyStatus;
    }

    public void setListenersGroupkeyStatus(
        Map<String, String> listenersGroupkeyStatus) {
        this.listenersGroupkeyStatus = listenersGroupkeyStatus;
    }

}
