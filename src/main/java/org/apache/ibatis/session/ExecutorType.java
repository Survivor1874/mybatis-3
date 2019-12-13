/**
 * Copyright 2009-2015 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.ibatis.session;

/**
 * @author Clinton Begin
 */
public enum ExecutorType {

    /**
     * 即每次用完Statement 后，都会关闭Statement，而后下次由重新打开
     */
    SIMPLE,

    /**
     * 会将 Statement 存储到 Map<String, Statement> 中，key是boundSql.getSql()
     */
    REUSE,

    /**
     * 这种执行方式，主要用于批量操作，每次执行将statement预存到有序集合，主要用于循环或者多次执行构建一个存储过程或批处理过程
     */
    BATCH
}
