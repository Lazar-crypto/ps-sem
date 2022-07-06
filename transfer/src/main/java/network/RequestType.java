package network;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

@JsonSerialize
public enum RequestType implements Serializable {
    LOGIN,
    SAVE_FAMILY_TREE,
    GET_NODES_OF_TREE,
    GET_ALL_TREES,
    SAVE_NODE,
    LOGOUT,
    UPDATE_NODE,
    GET_TREES_OF_USER,
    DELETE_FAMILY_TREE,
    DELETE_NODE,
    GET_NODES_FOR_UPDATE,
    GET_FAMILY_TREE_ROOT,
    FIND_KINSHIP,
    GET_NODE_INFO
}
