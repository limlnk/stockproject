import axios from 'axios'
import React from 'react'

const StockMember_BASE_REST_API_URL='http://localhost:8090/api/v1/stockmembers';

class StockMemberService{
    getAllStockMembers(){
        return axios.get(StockMember_BASE_REST_API_URL);
    }
    createStockMember(stockmember){
        return axios.post(StockMember_BASE_REST_API_URL);
    }
    getStockMemberById(stockmemberId){
        return axios.get(StockMember_BASE_REST_API_URL+'/'+stockmemberId);
    }
    updateStockMember(stockmember,stockmemberId){
        return axios.put(StockMember_BASE_REST_API_URL+'/'+stockmemberId,stockmember);
    }
}

export default StockMemberService
