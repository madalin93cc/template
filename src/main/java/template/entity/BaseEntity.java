package template.entity;

import java.io.Serializable;

/**
 * Created by Madalin.Colezea on 7/2/2015.
 */
public interface BaseEntity extends Serializable{
    public Long getId();

    public void setId(Long id);
}
