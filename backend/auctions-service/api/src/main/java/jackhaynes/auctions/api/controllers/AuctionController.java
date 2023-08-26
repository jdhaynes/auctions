package jackhaynes.auctions.api.controllers;

import jackhaynes.auctions.api.dtos.Auction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("auctions")
public class AuctionController {
    @GetMapping("/")
    public List<Auction> getAuctions() {
        return new ArrayList<>();
    }
}
