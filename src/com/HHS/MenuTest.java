package com.HHS;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Deze test checkt of de keuzes echt gevuld worden 
class MenuTest {


    @Test
    void keuzesVullenTest() {

        assertFalse(Menu.KeuzesVullen().isEmpty());
    }
}