/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.lazydev.projects.covidform.jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import me.lazydev.projects.covidform.models.Form;

/**
 *
 * @author Yoffa
 */
@Stateless
public class FormFacade extends AbstractFacade<Form> {

    @PersistenceContext(unitName = "CovidFormPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FormFacade() {
        super(Form.class);
    }
    
}
