/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/
package org.apache.plc4x.java.isotp.protocol.model.types;

import java.util.HashMap;
import java.util.Map;

public enum RejectCause {
    REASON_NOT_SPECIFIED((byte) 0x00),
    INVALID_PARAMETER_CODE((byte) 0x01),
    INVALID_TPDU_TYPE((byte) 0x02),
    INVALID_PARAMETER_TYPE((byte) 0x03);

    private static final Map<Byte, RejectCause> map;
    static {
        map = new HashMap<>();
        for (RejectCause rejectCause : RejectCause.values()) {
            map.put(rejectCause.code, rejectCause);
        }
    }

    private final byte code;

    RejectCause(byte code) {
        this.code = code;
    }

    public byte getCode() {
        return code;
    }

    public static RejectCause valueOf(byte code) {
        return map.get(code);
    }

}
