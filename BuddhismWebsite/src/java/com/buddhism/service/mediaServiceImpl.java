/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.buddhism.service;

import com.buddhism.dao.mediaDaoImpl;
import com.buddhism.model.Media;
import com.buddhism.model.Packet;
import com.buddhism.model.Post;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Trine
 */
public class mediaServiceImpl implements mediaService
{
    private mediaDaoImpl mediadao;
    @Override
    public void setMedia(Media media) 
    {
        try {
            getMediadao().addMedia(media);
        } catch (Exception ex) {
            Logger.getLogger(mediaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public int getMediaNumber(int mediaType) 
    {
        //return getMediadao().getMedia(mediaType).size();
        return getMediadao().getMediaNumber(mediaType);
    }

    @Override
    public void setMedia(Packet packet, String mediaUrl, int mediaType, String mediaDesc) 
    {
        Media media = new Media();
        media.setId(1);
        media.setMediaType((short)mediaType);
        media.setMediaUrl(mediaUrl);
        media.setPacket(packet);
        media.setMediaDesc(mediaDesc);
        
        try {
            mediadao.addMedia(media);
        } catch (Exception ex) {
            Logger.getLogger(mediaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the mediadao
     */
    public mediaDaoImpl getMediadao() {
        return mediadao;
    }

    /**
     * @param mediadao the mediadao to set
     */
    public void setMediadao(mediaDaoImpl mediadao) {
        this.mediadao = mediadao;
    }

    @Override
    public List<Media> getMedia(int mediaType) 
    {
        return mediadao.getMediaByType(mediaType);
    }
    
}
