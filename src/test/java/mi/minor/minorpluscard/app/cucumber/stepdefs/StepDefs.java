package mi.minor.minorpluscard.app.cucumber.stepdefs;

import mi.minor.minorpluscard.app.MinorpluscardApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MinorpluscardApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
