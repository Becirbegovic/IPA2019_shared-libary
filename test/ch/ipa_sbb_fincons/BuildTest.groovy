package ch.ipa_sbb_fincons;

import ch.ipa_sbb_fincons.jenkins.Build;
import org.junit.Before;
import org.junit.Test

import static org.junit.Assert.assertEquals;

class BuildTest {

    private Build build;

    private static final String MESSAGE = 'MESSAGE';
    private static final String DESCRIPTION = 'DESCRIPTION';

    @Before
    void setup() {

    }

    @Test
    void testBuildDescription() {
        build.setBuildDescription(
                title: MESSAGE,
                description: DESCRIPTION,
        );

        assertEquals "result:", "MESSAGE", result

    }
}
