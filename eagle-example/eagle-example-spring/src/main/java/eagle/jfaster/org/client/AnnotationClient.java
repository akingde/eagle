/*
 * Copyright 2017 eagle.jfaster.org.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package eagle.jfaster.org.client;

import eagle.jfaster.org.service.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by fangyanpeng on 2017/8/18.
 */
public class AnnotationClient {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("client_annotation.xml");
        appCtx.start();
        Hello hello = appCtx.getBean("helloAnno",Hello.class);
        System.out.println(hello.hello());
    }
}
