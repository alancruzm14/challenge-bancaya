/**
 * 
 */
package com.bankaya.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankaya.challenge.model.mysql.Bitacora;

/**
 * @author macbook
 *
 */
@Repository
public interface BitacoraRepository extends JpaRepository<Bitacora, Integer> {

}
