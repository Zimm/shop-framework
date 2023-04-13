import axios from 'axios';
import authHeader from './auth-header';
import authService from './auth.service';

const API_URL = 'http://localhost:8080/api/order/';

export class OrderService {
  async sendOrder(data) {
    console.log(authService.getCurrentUser().id)
    return await axios.post(API_URL,{
        userid: authService.getCurrentUser().id,
        products : data.toString()
    }, { headers: authHeader() });
  }

  
}

export default new OrderService();
