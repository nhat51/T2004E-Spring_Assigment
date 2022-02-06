import axios from "axios";

const URL_PRODUCTS = "http://localhost:8080/api/v1/streets";

class StreetService {
    getAll(params){
        return axios.get(URL_PRODUCTS,{
            params: params,
        });
    }
    addStreet(body){
        return axios.post(URL_PRODUCTS,body);
    }

}

export default new StreetService();