/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.apache.kylin.stream.core.model;

import org.apache.kylin.stream.core.consumer.ConsumerStartProtocol;

public class StartConsumersRequest {
    private String cube;
    private ConsumerStartProtocol startProtocol;

    public String getCube() {
        return cube;
    }

    public void setCube(String cube) {
        this.cube = cube;
    }

    public ConsumerStartProtocol getStartProtocol() {
        return startProtocol;
    }

    public void setStartProtocol(ConsumerStartProtocol startProtocol) {
        this.startProtocol = startProtocol;
    }

    @Override
    public String toString() {
        return "StartConsumersRequest{" + "cube='" + cube + '\'' + ", startProtocol='" + startProtocol + '\'' + '}';
    }
}
