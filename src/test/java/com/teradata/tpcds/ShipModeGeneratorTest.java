/*
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
 */

package com.teradata.tpcds;

import org.testng.annotations.Test;

import static com.teradata.tpcds.GeneratorAssertions.assertPartialMD5;
import static com.teradata.tpcds.Session.getDefaultSession;
import static com.teradata.tpcds.Table.SHIP_MODE;

public class ShipModeGeneratorTest
{
    private static final Session TEST_SESSION = getDefaultSession().withTable(SHIP_MODE);

    @Test
    public void testScaleFactor1()
    {
        assertPartialMD5(1, TEST_SESSION.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, TEST_SESSION, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor10()
    {
        Session session = TEST_SESSION.withScale(10);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor100()
    {
        Session session = TEST_SESSION.withScale(100);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor300()
    {
        Session session = TEST_SESSION.withScale(300);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor1000()
    {
        Session session = TEST_SESSION.withScale(1000);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor3000()
    {
        Session session = TEST_SESSION.withScale(3000);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor10000()
    {
        Session session = TEST_SESSION.withScale(10000);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor30000()
    {
        Session session = TEST_SESSION.withScale(30000);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testScaleFactor100000()
    {
        Session session = TEST_SESSION.withScale(100000);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }

    @Test
    public void testUndefinedScale()
    {
        Session session = TEST_SESSION.withScale(15);
        assertPartialMD5(1, session.getScaling().getRowCount(SHIP_MODE), SHIP_MODE, session, "791d16af982a67ad170a6b6527e25a35");
    }
}