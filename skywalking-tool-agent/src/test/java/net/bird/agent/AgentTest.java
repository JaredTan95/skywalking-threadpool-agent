/*
 *    Copyright 2021 Binglong Li
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package net.bird.agent;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author binglongli217932
 * <a href="mailto:libinglong9@gmail.com">libinglong:libinglong9@gmail.com</a>
 * @since 2021/1/4
 */

public class AgentTest {

    @Test
    public void fun() {

        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            executorService.submit(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    System.out.println("hh");
                    return "result";
                }
            });
        } catch (Throwable e){
            e.printStackTrace();
        }

    }
}
