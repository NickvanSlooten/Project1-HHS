package com.HHS;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {


    @Test
    void keuzesVullenTest() {

        assertFalse(Menu.KeuzesVullen().isEmpty());
    }
}