package com.gang.study.webflow.demo.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @Classname InitAction
 * @Description TODO
 * @Date 2021/1/21 14:22
 * @Created by zengzg
 */
@Service
public class InitAction extends AbstractAction {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void actionPerformed(ActionEvent e) {
        logger.info("------> this is in initAction <-------");
    }
}
